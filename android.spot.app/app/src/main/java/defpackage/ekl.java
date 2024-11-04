package defpackage;

import android.os.Parcelable;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ekl implements Parcelable {
    public final jer h;
    public final jer i;
    public final jer j;
    public final jer k;
    public final jer l;
    public final ifj m;
    public final ekj n;
    public final jer o;

    public ekl() {
        throw null;
    }

    public static ekk a() {
        ekk ekkVar = new ekk((byte[]) null);
        ekkVar.d(ifj.STOPPED);
        ekkVar.c(ekj.NONE);
        return ekkVar;
    }

    public final jer b() {
        long intValue = ((Integer) this.i.e(0)).intValue() - (SystemClock.elapsedRealtime() - ((Long) this.h.e(0L)).longValue());
        if (intValue > 0) {
            return jer.i(Integer.valueOf((int) intValue));
        }
        return jdl.a;
    }

    public final int c() {
        if (b().g()) {
            if (this.m != ifj.STOPPED) {
                return 1;
            }
            jer jerVar = this.k;
            if (jerVar.g() && ((kzi) jerVar.c()).a == 1) {
                return 4;
            }
            return 3;
        }
        jer jerVar2 = this.j;
        if (!jerVar2.g() || ((kzi) jerVar2.c()).a != 1) {
            return 1;
        }
        return 2;
    }

    public final int d() {
        int ordinal = this.m.ordinal();
        if (ordinal == 0) {
            return 2;
        }
        if (ordinal == 1) {
            return 3;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return c();
            }
            throw new AssertionError("Unreachable code after exhaustive switch");
        }
        return 4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ekl) {
            ekl eklVar = (ekl) obj;
            if (this.h.equals(eklVar.h) && this.i.equals(eklVar.i) && this.j.equals(eklVar.j) && this.k.equals(eklVar.k) && this.l.equals(eklVar.l) && this.m.equals(eklVar.m) && this.n.equals(eklVar.n) && this.o.equals(eklVar.o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.h.hashCode() ^ 1000003) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode();
    }

    public final String toString() {
        jer jerVar = this.o;
        ekj ekjVar = this.n;
        ifj ifjVar = this.m;
        jer jerVar2 = this.l;
        jer jerVar3 = this.k;
        jer jerVar4 = this.j;
        jer jerVar5 = this.i;
        return "SpotDeviceRingingState{ringingStartedMillis=" + this.h.toString() + ", ringingDurationMillis=" + jerVar5.toString() + ", makeSoundActionState=" + jerVar4.toString() + ", stopSoundActionState=" + jerVar3.toString() + ", currentRingingRequestId=" + jerVar2.toString() + ", localRingingState=" + ifjVar.toString() + ", localRingingErrorType=" + ekjVar.toString() + ", ringingComponent=" + jerVar.toString() + "}";
    }

    public ekl(jer jerVar, jer jerVar2, jer jerVar3, jer jerVar4, jer jerVar5, ifj ifjVar, ekj ekjVar, jer jerVar6) {
        if (jerVar == null) {
            throw new NullPointerException("Null ringingStartedMillis");
        }
        this.h = jerVar;
        if (jerVar2 != null) {
            this.i = jerVar2;
            if (jerVar3 != null) {
                this.j = jerVar3;
                if (jerVar4 != null) {
                    this.k = jerVar4;
                    if (jerVar5 != null) {
                        this.l = jerVar5;
                        if (ifjVar != null) {
                            this.m = ifjVar;
                            if (ekjVar != null) {
                                this.n = ekjVar;
                                if (jerVar6 != null) {
                                    this.o = jerVar6;
                                    return;
                                }
                                throw new NullPointerException("Null ringingComponent");
                            }
                            throw new NullPointerException("Null localRingingErrorType");
                        }
                        throw new NullPointerException("Null localRingingState");
                    }
                    throw new NullPointerException("Null currentRingingRequestId");
                }
                throw new NullPointerException("Null stopSoundActionState");
            }
            throw new NullPointerException("Null makeSoundActionState");
        }
        throw new NullPointerException("Null ringingDurationMillis");
    }
}
