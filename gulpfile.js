import { watch } from "gulp";
import shell from "gulp-shell";

export function watchJavaFiles() {
	return watch(
		"src/**/*.java",
		{ ignoreInitial: true },
		shell.task(["npm run build"]),
	);
}

export default watchJavaFiles;