package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class doc implements dnp {
    private static final Set a = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    private final dnp b;

    public doc(dnp dnpVar) {
        this.b = dnpVar;
    }

    @Override // defpackage.dnp
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return a.contains(((Uri) obj).getScheme());
    }

    @Override // defpackage.dnp
    public final /* bridge */ /* synthetic */ bso b(Object obj, int i, int i2, div divVar) {
        return this.b.b(new dnf(((Uri) obj).toString(), dng.a), i, i2, divVar);
    }
}
