package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum jor {
    STRING('s', jot.GENERAL, "-#", true),
    BOOLEAN('b', jot.BOOLEAN, "-", true),
    CHAR('c', jot.CHARACTER, "-", true),
    DECIMAL('d', jot.INTEGRAL, "-0+ ,(", false),
    OCTAL('o', jot.INTEGRAL, "-#0(", false),
    HEX('x', jot.INTEGRAL, "-#0(", true),
    FLOAT('f', jot.FLOAT, "-#0+ ,(", false),
    EXPONENT('e', jot.FLOAT, "-#0+ (", true),
    GENERAL('g', jot.FLOAT, "-0+ ,(", true),
    EXPONENT_HEX('a', jot.FLOAT, "-#0+ ", true);

    public static final jor[] k = new jor[26];
    public final char l;
    public final jot m;
    public final int n;
    public final String o;

    static {
        for (jor jorVar : values()) {
            k[a(jorVar.l)] = jorVar;
        }
    }

    jor(char c, jot jotVar, String str, boolean z) {
        int i;
        this.l = c;
        this.m = jotVar;
        jos josVar = jos.a;
        if (true != z) {
            i = 0;
        } else {
            i = 128;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            int a = jos.a(str.charAt(i2));
            if (a >= 0) {
                i |= 1 << a;
            } else {
                throw new IllegalArgumentException("invalid flags: ".concat(str));
            }
        }
        this.n = i;
        this.o = "%" + c;
    }

    public static int a(char c) {
        return (c | ' ') - 97;
    }
}
