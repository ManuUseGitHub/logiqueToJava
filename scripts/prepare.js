import fs from "fs";
import camel from "to-camel-case";
const exercices = JSON.parse(fs.readFileSync("scripts/course.json"));
const javaFilePattern = fs.readFileSync("scripts/javaFilePattern.txt","utf-8");

const fileContent = (className) => {
	return javaFilePattern.replace(/__CLASS_NAME__/g, className);
};
function capitalizeFirstLetter(val) {
	return String(val).charAt(0).toUpperCase() + String(val).slice(1);
}
exercices.forEach((x, i) => {
	let cpt = 0;
	const dir = `src/be/technifutur/exercices/logiqueDeProgrammation/`;
	if (!fs.existsSync(dir)) {
		fs.mkdirSync(dir, { recursive: true });
	}
	while (cpt <= x.end) {
		const name = capitalizeFirstLetter(`${camel(x.title)}${i + 1}_${cpt}`);
		fs.writeFileSync(`${dir}/${name}.java`, fileContent(name));
		++cpt;
	}
});
