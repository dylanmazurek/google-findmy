package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mpj extends mov implements mqr {
    public mpj() {
        super(mov.b, null, null, null, false);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mpj) {
            mpj mpjVar = (mpj) obj;
            if (f().equals(mpjVar.f()) && this.d.equals(mpjVar.d) && this.e.equals(mpjVar.e) && amr.i(this.c, mpjVar.c)) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof mqr)) {
            return false;
        }
        return obj.equals(e());
    }

    public final int hashCode() {
        return (((f().hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final mqr i() {
        mqk e = e();
        if (e != this) {
            return (mqr) e;
        }
        throw new mnv();
    }

    public final String toString() {
        mqk e = e();
        if (e != this) {
            return e.toString();
        }
        return "property " + this.d + " (Kotlin reflection is not available)";
    }

    public mpj(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, 1 == i);
    }
}
