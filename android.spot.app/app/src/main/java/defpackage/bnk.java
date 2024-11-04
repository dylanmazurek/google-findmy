package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnk extends bnj {
    public int m;

    public bnk(bns bnsVar) {
        super(bnsVar);
        int i;
        if (true != (bnsVar instanceof bno)) {
            i = 3;
        } else {
            i = 2;
        }
        this.l = i;
    }

    @Override // defpackage.bnj
    public final void c(int i) {
        if (!this.i) {
            this.i = true;
            this.f = i;
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                ((bnh) it.next()).f();
            }
        }
    }
}
