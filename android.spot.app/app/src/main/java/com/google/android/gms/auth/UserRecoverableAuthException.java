package com.google.android.gms.auth;

import android.content.Intent;
import defpackage.fed;
import defpackage.fel;
import defpackage.fma;

/* compiled from: PG */
/* loaded from: classes.dex */
public class UserRecoverableAuthException extends fed {
    public final Intent a;
    public final fel b;

    public UserRecoverableAuthException(String str, Intent intent) {
        this(str, intent, fel.LEGACY);
    }

    public UserRecoverableAuthException(String str, Intent intent, fel felVar) {
        super(str);
        this.a = intent;
        fma.aR(felVar);
        this.b = felVar;
    }
}
