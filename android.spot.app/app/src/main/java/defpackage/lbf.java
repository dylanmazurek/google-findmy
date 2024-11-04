package defpackage;

import com.google.android.gms.maps.model.LatLng;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lbf {
    public final fsa a;
    public LatLng b;

    public lbf(fsa fsaVar) {
        this.a = fsaVar;
        this.b = fsaVar.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lbf) {
            return this.a.equals(((lbf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
