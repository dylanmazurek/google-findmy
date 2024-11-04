package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jpj implements jpf {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jpf
    public final /* synthetic */ void a(joa joaVar, Iterator it, Object obj) {
        if (joaVar.b) {
            if (joaVar.c && jpu.a() > 20) {
                while (it.hasNext()) {
                    obj.a(joaVar.a, it.next());
                }
                return;
            } else {
                joaVar.a(it, obj);
                return;
            }
        }
        throw new IllegalStateException("non repeating key");
    }
}
