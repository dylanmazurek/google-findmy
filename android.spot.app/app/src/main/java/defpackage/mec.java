package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mec {
    private ArrayList a = new ArrayList();
    private volatile lze b = lze.IDLE;

    public final void a(lze lzeVar) {
        lzeVar.getClass();
        if (this.b != lzeVar && this.b != lze.SHUTDOWN) {
            this.b = lzeVar;
            if (!this.a.isEmpty()) {
                ArrayList arrayList = this.a;
                this.a = new ArrayList();
                if (arrayList.size() > 0) {
                    throw null;
                }
            }
        }
    }
}
