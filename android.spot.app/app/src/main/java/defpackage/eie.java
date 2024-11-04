package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eie extends elg {
    public final eiv a;
    public final ekl b;

    public eie(eiv eivVar, ekl eklVar) {
        if (eivVar != null) {
            this.a = eivVar;
            if (eklVar != null) {
                this.b = eklVar;
                return;
            }
            throw new NullPointerException("Null spotDeviceRingingState");
        }
        throw new NullPointerException("Null localDeviceSpotState");
    }

    @Override // defpackage.elg, defpackage.eix
    public final eiv a() {
        return this.a;
    }

    @Override // defpackage.elg, defpackage.eix
    public final /* synthetic */ eiw b() {
        return new eid(this);
    }

    @Override // defpackage.elg, defpackage.eix
    public final ekl c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof elg) {
            elg elgVar = (elg) obj;
            if (this.a.equals(elgVar.a()) && this.b.equals(elgVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ekl eklVar = this.b;
        return "SpotLocalDeviceState{localDeviceSpotState=" + this.a.toString() + ", spotDeviceRingingState=" + eklVar.toString() + "}";
    }
}
