package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mpc extends mov implements mpb, mqn {
    private final int a;
    private final int f;

    public mpc(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, 1 == i2);
        this.a = i;
        this.f = 0;
    }

    @Override // defpackage.mpb
    public final int bQ() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mpc) {
            mpc mpcVar = (mpc) obj;
            if (this.d.equals(mpcVar.d) && this.e.equals(mpcVar.e)) {
                int i = mpcVar.f;
                if (this.a == mpcVar.a && amr.i(this.c, mpcVar.c) && amr.i(f(), mpcVar.f())) {
                    return true;
                }
            }
            return false;
        }
        if (!(obj instanceof mqn)) {
            return false;
        }
        return obj.equals(e());
    }

    @Override // defpackage.mov
    protected final void h() {
        int i = mpo.a;
    }

    public final int hashCode() {
        int hashCode;
        if (f() == null) {
            hashCode = 0;
        } else {
            hashCode = f().hashCode() * 31;
        }
        return ((hashCode + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        mqk e = e();
        if (e != this) {
            return e.toString();
        }
        if ("<init>".equals(this.d)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + this.d + " (Kotlin reflection is not available)";
    }

    public mpc(int i, Class cls, String str, String str2, int i2) {
        this(i, b, cls, str, str2, i2);
    }
}
