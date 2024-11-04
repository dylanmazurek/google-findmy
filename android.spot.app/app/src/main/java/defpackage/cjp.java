package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjp implements Comparable {
    public final int a;
    public final String b;
    public final String c;
    private final int d;

    public cjp(int i, int i2, String str, String str2) {
        this.a = i;
        this.d = i2;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        cjp cjpVar = (cjp) obj;
        cjpVar.getClass();
        int i = this.a - cjpVar.a;
        if (i == 0) {
            return this.d - cjpVar.d;
        }
        return i;
    }
}
