package defpackage;

import android.database.ContentObserver;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hve extends ContentObserver {
    final /* synthetic */ hvf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hve(hvf hvfVar) {
        super(null);
        this.a = hvfVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        hvf hvfVar = this.a;
        synchronized (hvfVar.e) {
            hvfVar.f = null;
            hwa.e();
        }
        synchronized (hvfVar) {
            Iterator it = hvfVar.g.iterator();
            while (it.hasNext()) {
                ((hvg) it.next()).a();
            }
        }
    }
}
