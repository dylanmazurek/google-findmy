package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jgj extends jge implements jls {
    private static final long serialVersionUID = 7431625294878419160L;

    public jgj(Map map) {
        super(map);
    }

    @Override // defpackage.jge
    public /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    @Override // defpackage.jge
    public final Collection c(Object obj, Collection collection) {
        return new jgd(this, obj, (Set) collection);
    }

    @Override // defpackage.jge, defpackage.jls
    /* renamed from: d */
    public final Set b(Object obj) {
        return (Set) super.b(obj);
    }

    @Override // defpackage.jgh, defpackage.jls
    public final /* bridge */ /* synthetic */ Collection p() {
        throw null;
    }
}
