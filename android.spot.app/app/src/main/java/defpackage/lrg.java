package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lrg implements lra, lsa {
    private final Set a = new HashSet();
    private boolean b = false;

    @Override // defpackage.lsa
    public final void a(lrz lrzVar) {
        iqg.H();
        if (!this.b) {
            this.a.add(lrzVar);
            return;
        }
        throw new IllegalStateException("There was a race between the call to add/remove an OnClearedListener and onCleared(). This can happen when posting to the Main thread from a background thread, which is not supported.");
    }

    public final void b() {
        iqg.H();
        this.b = true;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((lrz) it.next()).b();
        }
    }
}
