package y2020.d10

fun Map<Int, Int>.printResult() = println("""
    1-jolt diffs: ${this[1]}
    3-jolt diffs: ${this[3]}
    product: ${this[1]!! * this[3]!!}
    """.trimIndent())

fun Long.printResult() = println("All there are $this possible configurations")

val preparedInput: List<Int> by lazy {
    input.lines().map { it.toInt() }
}

private const val input = """30
73
84
136
132
117
65
161
49
68
139
46
21
127
109
153
163
160
18
22
131
146
62
113
172
150
171
98
93
130
170
59
1
110
2
55
37
44
148
102
40
28
35
43
56
169
33
5
141
83
15
105
142
36
116
11
45
82
10
17
159
140
12
108
29
72
121
52
91
166
88
97
118
99
124
149
16
9
143
104
57
79
123
58
96
24
162
23
92
69
147
156
25
133
34
8
85
76
103
122"""