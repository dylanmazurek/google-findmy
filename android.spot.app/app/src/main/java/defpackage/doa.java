package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class doa implements dnp {
    private static final Set a = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));
    private final dnz b;

    public doa(dnz dnzVar) {
        this.b = dnzVar;
    }

    @Override // defpackage.dnp
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return a.contains(((Uri) obj).getScheme());
    }

    @Override // defpackage.dnp
    public final /* bridge */ /* synthetic */ bso b(Object obj, int i, int i2, div divVar) {
        Uri uri = (Uri) obj;
        return new bso(new dtb(uri), this.b.a(uri));
    }
}
