import { execSync } from "child_process";
import { reargv } from "reargv";

const args = reargv();
const className = args.misc[0] || args.options.c;

if (!className) {
	console.error("❌ Please provide a pacakge with class-name.");
	console.log("Example:");
	console.log("  npm run run MyClassNamePackage.ex1_1");
	console.log("OR:");
	console.log("  npm run run -- -p MyClassNamePackage.ex1_1");
	process.exit(1);
}

try {
	execSync(
		`java -cp build be.technifutur.exercices.logiqueDeProgrammation.${className}`,
		{ stdio: "inherit" },
	);
} catch (error) {
	console.error("❌ Error while running Java class.");
	process.exit(1);
}
