package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class anw extends mpe implements mol {
    final /* synthetic */ anz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anw(anz anzVar) {
        super(2);
        this.a = anzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        anz anzVar;
        Object obj3;
        Object ac;
        Set set = (Set) obj;
        do {
            anzVar = this.a;
            obj3 = anzVar.b.get();
            if (obj3 == null) {
                ac = set;
            } else if (obj3 instanceof Set) {
                ac = mkm.P(obj3, set);
            } else if (obj3 instanceof List) {
                ac = mkm.ac((Collection) obj3, mkm.N(set));
            } else {
                anz.c();
                throw new mks();
            }
        } while (!a.o(anzVar.b, obj3, ac));
        if (this.a.b()) {
            anz anzVar2 = this.a;
            anzVar2.a.a(new any(anzVar2));
        }
        return mlh.a;
    }
}
