package defpackage;

import com.google.android.gms.maps.model.LatLng;
import java.util.Collection;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class law implements lam {
    public final Collection a = new LinkedHashSet();
    private final LatLng b;

    public law(LatLng latLng) {
        this.b = latLng;
    }

    @Override // defpackage.lam
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.lam
    public final LatLng b() {
        return this.b;
    }

    @Override // defpackage.lam
    public final Collection c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof law)) {
            return false;
        }
        law lawVar = (law) obj;
        if (!lawVar.b.equals(this.b) || !lawVar.a.equals(this.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode();
    }

    public final String toString() {
        Collection collection = this.a;
        return "StaticCluster{mCenter=" + this.b.toString() + ", mItems.size=" + collection.size() + "}";
    }
}
