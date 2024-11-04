package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aw extends pn {
    @Override // defpackage.pn
    public final /* synthetic */ Intent a(Context context, Object obj) {
        Bundle bundleExtra;
        pm pmVar = (pm) obj;
        Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent intent2 = pmVar.b;
        if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                pmVar = new pm(pmVar.a, null, pmVar.c, pmVar.d);
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", pmVar);
        if (be.Z(2)) {
            intent.toString();
        }
        return intent;
    }

    @Override // defpackage.pn
    public final /* synthetic */ Object b(int i, Intent intent) {
        return new pc(i, intent);
    }
}
