package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
final class drs implements drc {
    final /* synthetic */ drz a;

    public drs(drz drzVar) {
        this.a = drzVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Collection, java.lang.Object] */
    @Override // defpackage.drc
    public final void a(boolean z) {
        ArrayList arrayList;
        dtq.g();
        synchronized (this.a) {
            arrayList = new ArrayList((Collection) this.a.c);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((drc) arrayList.get(i)).a(z);
        }
    }
}
