//This script based on the sample in http://d.hatena.ne.jp/Kazuhira/20121111/1352637159

import scala.sys.process._

val builder = new StringBuilder
val ret = "ps" ! ProcessLogger(line => {
                                    builder ++= line
                                    builder ++= System.lineSeparator
                                  }, line => ())
val text = builder toString

println("Command Text:")
println(text)
printf("Command Result = %d%n", ret)