package defpackage;

import java.net.ProxySelector;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mid implements jfe {
    private final /* synthetic */ int a;

    public mid(int i) {
        this.a = i;
    }

    @Override // defpackage.jfe
    public final /* synthetic */ Object a() {
        if (this.a != 0) {
            return new jfd();
        }
        return ProxySelector.getDefault();
    }
}
