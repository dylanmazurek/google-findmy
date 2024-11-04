package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amd implements amb {
    final /* synthetic */ ame a;
    final /* synthetic */ String b;
    final /* synthetic */ mnw c;

    public amd(ame ameVar, String str, mnw mnwVar) {
        this.a = ameVar;
        this.b = str;
        this.c = mnwVar;
    }

    @Override // defpackage.amb
    public final void a() {
        List list = (List) this.a.b.remove(this.b);
        if (list != null) {
            list.remove(this.c);
        }
        if (list != null && !list.isEmpty()) {
            ame ameVar = this.a;
            ameVar.b.put(this.b, list);
        }
    }
}
