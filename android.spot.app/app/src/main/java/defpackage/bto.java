package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bto implements buc {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bto(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.buc
    public final /* synthetic */ void a(Object obj) {
        if (this.b != 0) {
            kvw kvwVar = (kvw) obj;
            if (kvwVar == null) {
                kvwVar = new kvw(-3);
            }
            ((elo) this.a).D(kvwVar);
            return;
        }
        kvw kvwVar2 = (kvw) obj;
        synchronized (btp.c) {
            ArrayList arrayList = (ArrayList) btp.d.get(this.a);
            if (arrayList == null) {
                return;
            }
            btp.d.remove(this.a);
            for (int i = 0; i < arrayList.size(); i++) {
                ((buc) arrayList.get(i)).a(kvwVar2);
            }
        }
    }
}
