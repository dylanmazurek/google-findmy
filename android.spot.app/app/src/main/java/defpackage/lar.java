package defpackage;

import com.google.android.gms.maps.model.LatLng;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lar implements lam {
    public final lbm a;
    public final dhx b;
    private final LatLng c;
    private final Set d;

    public lar(dhx dhxVar) {
        this.b = dhxVar;
        LatLng n = dhxVar.n();
        this.c = n;
        this.a = las.a.b(n);
        this.d = Collections.singleton(dhxVar);
    }

    @Override // defpackage.lam
    public final int a() {
        return 1;
    }

    @Override // defpackage.lam
    public final LatLng b() {
        return this.c;
    }

    @Override // defpackage.lam
    public final /* synthetic */ Collection c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lar)) {
            return false;
        }
        return ((lar) obj).b.equals(this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
