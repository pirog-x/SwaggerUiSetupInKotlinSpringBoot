Make sure, that you remove version from `implementation("com.fasterxml.jackson.module:jackson-module-kotlin")`
so that bom file will choose right one. Or de/serialization won't work.
