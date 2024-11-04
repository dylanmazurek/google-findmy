package defpackage;

import android.util.Log;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hhz implements jyj {
    final WeakReference a;

    public hhz(hia hiaVar) {
        this.a = new WeakReference(hiaVar);
    }

    @Override // defpackage.jyj
    public final void a(Throwable th) {
        Log.e(hia.a, "ContinueWithAccountListener execution threw an exception", th);
    }

    @Override // defpackage.jyj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Boolean bool = (Boolean) obj;
        hia hiaVar = (hia) this.a.get();
        if (hiaVar != null && !bool.booleanValue()) {
            hog.H(new hep(hiaVar, 12));
        }
    }
}
