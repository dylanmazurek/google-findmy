package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajl extends mpe implements moh {
    final /* synthetic */ Collection a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajl(Collection collection) {
        super(1);
        this.a = collection;
    }

    @Override // defpackage.moh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return Boolean.valueOf(this.a.contains(obj));
    }
}
