package defpackage;

import android.view.autofill.AutofillManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apf extends AutofillManager.AutofillCallback {
    public static final apf a = new apf();

    private apf() {
    }

    public final void a(apc apcVar) {
        cs$$ExternalSyntheticApiModelOutline0.m58m(apcVar.c).registerCallback(this);
    }

    public final void b(apc apcVar) {
        cs$$ExternalSyntheticApiModelOutline0.m58m(apcVar.c).unregisterCallback(this);
    }
}
