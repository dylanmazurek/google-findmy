package androidx.compose.ui.layout;

import defpackage.aow;
import defpackage.awm;
import defpackage.azf;
import defpackage.moh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OnGloballyPositionedElement extends azf {
    private final moh a;

    public OnGloballyPositionedElement(moh mohVar) {
        this.a = mohVar;
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ aow d() {
        return new awm(this.a);
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ void e(aow aowVar) {
        ((awm) aowVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof OnGloballyPositionedElement) && this.a == ((OnGloballyPositionedElement) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
