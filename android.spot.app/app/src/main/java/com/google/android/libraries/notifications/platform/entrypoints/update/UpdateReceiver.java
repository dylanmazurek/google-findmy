package com.google.android.libraries.notifications.platform.entrypoints.update;

import android.content.Context;
import defpackage.gou;
import defpackage.gov;
import defpackage.gqp;
import defpackage.mko;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class UpdateReceiver extends gou {
    @Override // defpackage.gou
    public final gov a(Context context) {
        gov govVar;
        mko mkoVar = (mko) gqp.a(context).i().get("update");
        if (mkoVar != null) {
            govVar = (gov) mkoVar.a();
        } else {
            govVar = null;
        }
        if (govVar != null) {
            return govVar;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // defpackage.gou
    public final boolean b() {
        return true;
    }

    @Override // defpackage.gou
    public final void c(Context context) {
    }
}
