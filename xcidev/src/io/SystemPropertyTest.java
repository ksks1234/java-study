package io;

public class SystemPropertyTest {
	public static void main(String[] args) {
		for(Object okey:System.getProperties().keySet()) {
			String key = (String) okey;
			System.out.println(key + " : " + System.getProperty("java.home"));
		}
		/* 자바에 대한 정보를 얻을 수 있음
		 * java.specification.version : C:\Program Files\Java\jdk-21
			sun.cpu.isalist : C:\Program Files\Java\jdk-21
			sun.jnu.encoding : C:\Program Files\Java\jdk-21
			java.class.path : C:\Program Files\Java\jdk-21
			java.vm.vendor : C:\Program Files\Java\jdk-21
			sun.arch.data.model : C:\Program Files\Java\jdk-21
			user.variant : C:\Program Files\Java\jdk-21
			java.vendor.url : C:\Program Files\Java\jdk-21
			java.vm.specification.version : C:\Program Files\Java\jdk-21
			os.name : C:\Program Files\Java\jdk-21
			sun.java.launcher : C:\Program Files\Java\jdk-21
			user.country : C:\Program Files\Java\jdk-21
			sun.boot.library.path : C:\Program Files\Java\jdk-21
			sun.java.command : C:\Program Files\Java\jdk-21
			jdk.debug : C:\Program Files\Java\jdk-21
			sun.cpu.endian : C:\Program Files\Java\jdk-21
			user.home : C:\Program Files\Java\jdk-21
			user.language : C:\Program Files\Java\jdk-21
			java.specification.vendor : C:\Program Files\Java\jdk-21
			java.version.date : C:\Program Files\Java\jdk-21
			java.home : C:\Program Files\Java\jdk-21
			file.separator : C:\Program Files\Java\jdk-21
			java.vm.compressedOopsMode : C:\Program Files\Java\jdk-21
			line.separator : C:\Program Files\Java\jdk-21
			java.vm.specification.vendor : C:\Program Files\Java\jdk-21
			java.specification.name : C:\Program Files\Java\jdk-21
			user.script : C:\Program Files\Java\jdk-21
			sun.management.compiler : C:\Program Files\Java\jdk-21
			java.runtime.version : C:\Program Files\Java\jdk-21
			user.name : C:\Program Files\Java\jdk-21
			stdout.encoding : C:\Program Files\Java\jdk-21
			path.separator : C:\Program Files\Java\jdk-21
			os.version : C:\Program Files\Java\jdk-21
			java.runtime.name : C:\Program Files\Java\jdk-21
			file.encoding : C:\Program Files\Java\jdk-21
			java.vm.name : C:\Program Files\Java\jdk-21
			java.vendor.url.bug : C:\Program Files\Java\jdk-21
			java.io.tmpdir : C:\Program Files\Java\jdk-21
			java.version : C:\Program Files\Java\jdk-21
			user.dir : C:\Program Files\Java\jdk-21
			os.arch : C:\Program Files\Java\jdk-21
			java.vm.specification.name : C:\Program Files\Java\jdk-21
			sun.os.patch.level : C:\Program Files\Java\jdk-21
			native.encoding : C:\Program Files\Java\jdk-21
			java.library.path : C:\Program Files\Java\jdk-21
			java.vm.info : C:\Program Files\Java\jdk-21
			stderr.encoding : C:\Program Files\Java\jdk-21
			java.vendor : C:\Program Files\Java\jdk-21
			java.vm.version : C:\Program Files\Java\jdk-21
			sun.io.unicode.encoding : C:\Program Files\Java\jdk-21
			java.class.version : C:\Program Files\Java\jdk-21
		 * */
	}

}
