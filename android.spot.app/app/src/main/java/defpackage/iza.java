package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iza extends iyv {
    final /* synthetic */ IBinder a;
    final /* synthetic */ jct b;

    public iza(jct jctVar, IBinder iBinder) {
        this.a = iBinder;
        this.b = jctVar;
    }

    @Override // defpackage.iyv
    public final void a() {
        iyn iynVar;
        IBinder iBinder = this.a;
        if (iBinder == null) {
            iynVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            if (queryLocalInterface instanceof iyn) {
                iynVar = (iyn) queryLocalInterface;
            } else {
                iynVar = new iyn(iBinder);
            }
        }
        Object obj = this.b.a;
        izc izcVar = (izc) obj;
        izcVar.l = iynVar;
        try {
            ((duf) ((izc) obj).l).a.linkToDeath(((izc) obj).i, 0);
        } catch (RemoteException e) {
            izcVar.m.j(e, "linkToDeath failed", new Object[0]);
        }
        ((izc) this.b.a).f = false;
        Iterator it = ((izc) this.b.a).c.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((izc) this.b.a).c.clear();
    }
}
