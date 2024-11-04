package androidx.compose.ui.platform;

import defpackage.amr;
import defpackage.aow;
import defpackage.azf;
import defpackage.bdh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TestTagElement extends azf {
    private final String a;

    public TestTagElement(String str) {
        this.a = str;
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ aow d() {
        return new bdh(this.a);
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ void e(aow aowVar) {
        ((bdh) aowVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestTagElement)) {
            return false;
        }
        return amr.i(this.a, ((TestTagElement) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
