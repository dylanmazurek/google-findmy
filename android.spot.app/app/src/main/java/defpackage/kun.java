package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kun implements DialogInterface.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ kun(ehl ehlVar, String str, int i) {
        this.c = i;
        this.b = ehlVar;
        this.a = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        if (i2 != 0) {
            if (i2 != 1) {
                ag agVar = (ag) this.a;
                agVar.C().Y(agVar.w(), -1, (Intent) this.b);
                return;
            }
            ehl ehlVar = (ehl) this.b;
            if (!ehlVar.au()) {
                ((jni) ((jni) ehl.a.g()).j("com/google/android/apps/adm/integrations/android/securedevice/SetLockscreenPasswordFragment", "setResultAndCloseFragment", 160, "SetLockscreenPasswordFragment.java")).r("Dialog button clicked after fragment got closed");
                return;
            }
            Object obj = this.a;
            Bundle bundle = new Bundle();
            bundle.putString("SET_PASSWORD_FRAGMENT_RESULT", (String) obj);
            ehlVar.H().P("SET_PASSWORD_FRAGMENT_RESULT", bundle);
            ehlVar.H().L();
            return;
        }
        ag agVar2 = (ag) this.a;
        agVar2.C().Y(agVar2.w(), -1, (Intent) this.b);
    }

    public /* synthetic */ kun(v vVar, Intent intent, int i) {
        this.c = i;
        this.a = vVar;
        this.b = intent;
    }
}
