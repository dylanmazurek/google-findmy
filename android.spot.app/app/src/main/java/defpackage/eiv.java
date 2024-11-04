package defpackage;

import android.os.Parcelable;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eiv implements Parcelable {
    public final jer d;
    public final boolean e;
    public final jer f;
    public final Boolean g;
    public final jiy h;
    public final jer i;

    public eiv() {
        throw null;
    }

    public static eiu c() {
        eiu eiuVar = new eiu((byte[]) null);
        eiuVar.d(false);
        eiuVar.d = false;
        return eiuVar;
    }

    public final eit a(kyh kyhVar) {
        eit eitVar = (eit) this.h.get(kyhVar);
        if (eitVar == null) {
            return eit.c;
        }
        return eitVar;
    }

    public final eit b() {
        return a(kyh.DEVICE_COMPONENT_UNSPECIFIED);
    }

    public final eiu d() {
        eiu eiuVar = new eiu(this);
        eiuVar.a.putAll((Map) Collection.EL.stream(this.h.entrySet()).collect(Collectors.toMap(new eff(3), new eff(5))));
        return eiuVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eiv) {
            eiv eivVar = (eiv) obj;
            if (this.d.equals(eivVar.d) && this.e == eivVar.e && this.f.equals(eivVar.f) && this.g.equals(eivVar.g) && this.h.equals(eivVar.h) && this.i.equals(eivVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.d.hashCode() ^ 1000003;
        if (true != this.e) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((((((((hashCode * 1000003) ^ i) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        jer jerVar = this.i;
        jiy jiyVar = this.h;
        jer jerVar2 = this.f;
        return "LocalDeviceSpotState{lastSuccessfulLocationFetchedTimeMillis=" + this.d.toString() + ", locationFailure=" + this.e + ", currentLocateRequestId=" + jerVar2.toString() + ", isRetryingLocateRequest=" + this.g + ", componentStates=" + jiyVar.toString() + ", scanStartTimeMillis=" + jerVar.toString() + "}";
    }

    public eiv(jer jerVar, boolean z, jer jerVar2, Boolean bool, jiy jiyVar, jer jerVar3) {
        if (jerVar == null) {
            throw new NullPointerException("Null lastSuccessfulLocationFetchedTimeMillis");
        }
        this.d = jerVar;
        this.e = z;
        if (jerVar2 != null) {
            this.f = jerVar2;
            this.g = bool;
            this.h = jiyVar;
            if (jerVar3 != null) {
                this.i = jerVar3;
                return;
            }
            throw new NullPointerException("Null scanStartTimeMillis");
        }
        throw new NullPointerException("Null currentLocateRequestId");
    }
}
