package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jld implements jei {
    final /* synthetic */ njz a;

    public jld(njz njzVar) {
        this.a = njzVar;
    }

    @Override // defpackage.jei
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        return new jlc(entry, this.a);
    }
}
