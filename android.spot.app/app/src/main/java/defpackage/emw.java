package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class emw extends pn {
    @Override // defpackage.pn
    public final /* synthetic */ Intent a(Context context, Object obj) {
        return new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE");
    }

    @Override // defpackage.pn
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        boolean z;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
