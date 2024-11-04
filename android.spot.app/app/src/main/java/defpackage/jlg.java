package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jlg extends jmu {
    final /* synthetic */ jei a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jlg(Iterator it, jei jeiVar) {
        super(it);
        this.a = jeiVar;
    }

    @Override // defpackage.jmu
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new jii(obj, this.a.a(obj));
    }
}
