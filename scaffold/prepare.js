import fs from "fs";
import camel from "to-camel-case";
const exercices = JSON.parse(fs.readFileSync("scaffold/course.json"));
const javaFilePattern = fs.readFileSync(
	"scaffold/javaFilePattern.txt",
	"utf-8",
);

const fileContent = (className, folderName) => {
	return javaFilePattern
		.replace(/__CLASS_NAME__/g, className)
		.replace(/__FOLDER__/g, folderName);
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
		const name = `Ex${i + 1}_${cpt}`;
		const folder = `${capitalizeFirstLetter(`${camel(x.title)}`)}`;
		const exDir = `${dir}/${folder}`;
		const filePath = `${exDir}/${name}.java`;

		if (!fs.existsSync(exDir)) {
			fs.mkdirSync(exDir);
		}

		if (!fs.existsSync(filePath)) {
			fs.writeFileSync(filePath, fileContent(name, folder));
			console.log(`src/(...)/${name}.java created`);
		}
		++cpt;
	}
});
