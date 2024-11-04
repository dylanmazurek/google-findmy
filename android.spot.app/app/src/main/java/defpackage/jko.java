package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jko {
    public int a;
    public Object b;
    public Object c;

    public jko() {
    }

    public final void a(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null group");
    }

    public jko(jkp jkpVar) {
        this.b = jkpVar;
        this.c = jkpVar;
        jkpVar.f = null;
        jkpVar.e = null;
        this.a = 1;
    }
}
