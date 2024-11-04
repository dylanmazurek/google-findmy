package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import defpackage.fgd;
import defpackage.fma;
import defpackage.kne;
import defpackage.ksb;
import defpackage.pt;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends fgd {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fgd
    public final int a(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) fma.p(ksb.b(cloudMessage.a, context, new pt(8)))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    @Override // defpackage.fgd
    protected final void b(Bundle bundle) {
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (kne.s(putExtras)) {
            kne.q("_nd", putExtras.getExtras());
        }
    }
}
