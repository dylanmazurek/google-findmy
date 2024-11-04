package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezz implements Comparable {
    public static final ezz a = new ezz();
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    private ezz() {
        this.b = "DEFAULT";
        this.c = "";
        this.d = null;
        this.e = false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((ezz) obj).c.compareTo(this.c);
    }

    public ezz(String str, String str2) {
        int i;
        this.b = str;
        String[] split = fab.a.split(str2);
        if (split.length != 0) {
            boolean z = false;
            this.c = split[0];
            String str3 = null;
            int i2 = 1;
            while (true) {
                int length = split.length;
                if (i2 >= length) {
                    this.d = str3;
                    this.e = z;
                    return;
                }
                String lowerCase = split[i2].toLowerCase();
                if (lowerCase.equals("rewrite") && (i = i2 + 1) < length) {
                    str3 = split[i];
                    i2 += 2;
                } else {
                    if (!lowerCase.equals("block")) {
                        throw new faa("Illegal rule: ".concat(str2));
                    }
                    i2++;
                    z = true;
                }
            }
        } else {
            throw new faa("Empty rule");
        }
    }
}
