package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amn extends mpe implements moh {
    final /* synthetic */ List a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amn(List list) {
        super(1);
        this.a = list;
    }

    @Override // defpackage.moh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((moh) list.get(i)).a(obj);
        }
        return mlh.a;
    }
}
