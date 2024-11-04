package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class een extends efp {
    public final eiv a;
    public final ekl b;
    public final jer c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final jer g;
    public final jer h;
    public final boolean i;
    public final jer j;
    public final jer k;
    public final jer l;
    public final jer m;
    public final jer n;
    public final jer o;
    public final int p;
    public final int q;

    public een(eiv eivVar, ekl eklVar, jer jerVar, boolean z, boolean z2, boolean z3, jer jerVar2, jer jerVar3, int i, boolean z4, jer jerVar4, int i2, jer jerVar5, jer jerVar6, jer jerVar7, jer jerVar8, jer jerVar9) {
        if (eivVar == null) {
            throw new NullPointerException("Null localDeviceSpotState");
        }
        this.a = eivVar;
        if (eklVar != null) {
            this.b = eklVar;
            if (jerVar != null) {
                this.c = jerVar;
                this.d = z;
                this.e = z2;
                this.f = z3;
                if (jerVar2 != null) {
                    this.g = jerVar2;
                    if (jerVar3 != null) {
                        this.h = jerVar3;
                        this.p = i;
                        this.i = z4;
                        if (jerVar4 != null) {
                            this.j = jerVar4;
                            this.q = i2;
                            if (jerVar5 != null) {
                                this.k = jerVar5;
                                if (jerVar6 != null) {
                                    this.l = jerVar6;
                                    if (jerVar7 != null) {
                                        this.m = jerVar7;
                                        if (jerVar8 != null) {
                                            this.n = jerVar8;
                                            if (jerVar9 != null) {
                                                this.o = jerVar9;
                                                return;
                                            }
                                            throw new NullPointerException("Null ringingWillStopMillis");
                                        }
                                        throw new NullPointerException("Null ringingStartedMillis");
                                    }
                                    throw new NullPointerException("Null stopSoundActionId");
                                }
                                throw new NullPointerException("Null makeSoundActionId");
                            }
                            throw new NullPointerException("Null lastSuccessfulLocationFetchedTimeMillis");
                        }
                        throw new NullPointerException("Null locationTimestamp");
                    }
                    throw new NullPointerException("Null location");
                }
                throw new NullPointerException("Null androidLocationEncryptionKey");
            }
            throw new NullPointerException("Null currentLocateRequestId");
        }
        throw new NullPointerException("Null spotDeviceRingingState");
    }

    @Override // defpackage.efp, defpackage.eix
    public final eiv a() {
        return this.a;
    }

    @Override // defpackage.efp, defpackage.eix
    public final /* synthetic */ eiw b() {
        return new efn(this);
    }

    @Override // defpackage.efp, defpackage.eix
    public final ekl c() {
        return this.b;
    }

    @Override // defpackage.efp
    public final efn d() {
        return new efn(this);
    }

    @Override // defpackage.efp
    public final jer e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efp) {
            efp efpVar = (efp) obj;
            if (this.a.equals(efpVar.a()) && this.b.equals(efpVar.c()) && this.c.equals(efpVar.f()) && this.d == efpVar.o() && this.e == efpVar.p() && this.f == efpVar.q() && this.g.equals(efpVar.e()) && this.h.equals(efpVar.h()) && this.p == efpVar.r() && this.i == efpVar.n() && this.j.equals(efpVar.i()) && this.q == efpVar.s() && this.k.equals(efpVar.g()) && this.l.equals(efpVar.j()) && this.m.equals(efpVar.m()) && this.n.equals(efpVar.k()) && this.o.equals(efpVar.l())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.efp
    public final jer f() {
        return this.c;
    }

    @Override // defpackage.efp
    public final jer g() {
        return this.k;
    }

    @Override // defpackage.efp
    public final jer h() {
        return this.h;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        int i4 = 1237;
        if (true != this.d) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i5 = ((hashCode * 1000003) ^ i) * 1000003;
        if (true != this.e) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i6 = (i5 ^ i2) * 1000003;
        if (true != this.f) {
            i3 = 1237;
        } else {
            i3 = 1231;
        }
        int hashCode2 = ((((i6 ^ i3) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
        int i7 = this.p;
        a.N(i7);
        int i8 = ((hashCode2 * 1000003) ^ i7) * 1000003;
        if (true == this.i) {
            i4 = 1231;
        }
        int hashCode3 = ((i8 ^ i4) * 1000003) ^ this.j.hashCode();
        int i9 = this.q;
        a.N(i9);
        return (((((((((((hashCode3 * 1000003) ^ i9) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode();
    }

    @Override // defpackage.efp
    public final jer i() {
        return this.j;
    }

    @Override // defpackage.efp
    public final jer j() {
        return this.l;
    }

    @Override // defpackage.efp
    public final jer k() {
        return this.n;
    }

    @Override // defpackage.efp
    public final jer l() {
        return this.o;
    }

    @Override // defpackage.efp
    public final jer m() {
        return this.m;
    }

    @Override // defpackage.efp
    public final boolean n() {
        return this.i;
    }

    @Override // defpackage.efp
    public final boolean o() {
        return this.d;
    }

    @Override // defpackage.efp
    public final boolean p() {
        return this.e;
    }

    @Override // defpackage.efp
    public final boolean q() {
        return this.f;
    }

    @Override // defpackage.efp
    public final int r() {
        return this.p;
    }

    @Override // defpackage.efp
    public final int s() {
        return this.q;
    }

    public final String toString() {
        jer jerVar = this.o;
        jer jerVar2 = this.n;
        jer jerVar3 = this.m;
        jer jerVar4 = this.l;
        jer jerVar5 = this.k;
        jer jerVar6 = this.j;
        jer jerVar7 = this.h;
        jer jerVar8 = this.g;
        jer jerVar9 = this.c;
        ekl eklVar = this.b;
        return "AndroidLocalDeviceState{localDeviceSpotState=" + this.a.toString() + ", spotDeviceRingingState=" + eklVar.toString() + ", currentLocateRequestId=" + jerVar9.toString() + ", historicLocationReceived=" + this.d + ", liveLocationReceived=" + this.e + ", pastLocateActionTimeout=" + this.f + ", androidLocationEncryptionKey=" + jerVar8.toString() + ", location=" + jerVar7.toString() + ", locationError=" + bsf.d(this.p) + ", shouldRefreshLocation=" + this.i + ", locationTimestamp=" + jerVar6.toString() + ", locationSource=" + bsf.c(this.q) + ", lastSuccessfulLocationFetchedTimeMillis=" + jerVar5.toString() + ", makeSoundActionId=" + jerVar4.toString() + ", stopSoundActionId=" + jerVar3.toString() + ", ringingStartedMillis=" + jerVar2.toString() + ", ringingWillStopMillis=" + jerVar.toString() + "}";
    }
}
