resolvers += Resolver.bintrayIvyRepo("mediative", "sbt-plugins")
resolvers += Resolver.bintrayIvyRepo("fonseca", "sbt-plugins")

addSbtPlugin("com.mediative.sbt"   % "sbt-mediative-core"   % "0.5.6")
addSbtPlugin("com.mediative.sbt"   % "sbt-mediative-oss"    % "0.5.6")
addSbtPlugin("com.mediative.sbt"   % "sbt-mediative-devops" % "0.5.6")
addSbtPlugin("com.github.tkawachi" % "sbt-doctest"          % "0.4.1")
