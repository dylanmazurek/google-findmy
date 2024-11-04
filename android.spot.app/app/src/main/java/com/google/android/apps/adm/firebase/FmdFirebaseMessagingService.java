package com.google.android.apps.adm.firebase;

import android.text.TextUtils;
import defpackage.ddg;
import defpackage.ebi;
import defpackage.ewc;
import defpackage.hri;
import defpackage.hwx;
import defpackage.jnk;
import defpackage.lqz;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FmdFirebaseMessagingService extends ebi {
    private static final jnk f = jnk.l("com/google/android/apps/adm/firebase/FmdFirebaseMessagingService");
    public lqz a;
    public ewc b;
    public ddg c;
    public hri d;

    /* JADX WARN: Removed duplicated region for block: B:34:0x0165 A[Catch: ljy -> 0x0221, TryCatch #1 {ljy -> 0x0221, blocks: (B:3:0x0008, B:6:0x0018, B:8:0x003a, B:9:0x003c, B:11:0x0056, B:12:0x0058, B:15:0x006d, B:18:0x0065, B:19:0x0082, B:21:0x008e, B:23:0x00db, B:26:0x0122, B:27:0x0128, B:29:0x013a, B:32:0x0155, B:34:0x0165, B:35:0x018b, B:37:0x01a5, B:38:0x01ad, B:41:0x01b6, B:44:0x01c4, B:46:0x01da, B:48:0x01f5, B:49:0x0208, B:51:0x0204, B:53:0x016c, B:56:0x0170, B:58:0x0178, B:59:0x014b, B:60:0x0151), top: B:2:0x0008, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01a5 A[Catch: ljy -> 0x0221, TryCatch #1 {ljy -> 0x0221, blocks: (B:3:0x0008, B:6:0x0018, B:8:0x003a, B:9:0x003c, B:11:0x0056, B:12:0x0058, B:15:0x006d, B:18:0x0065, B:19:0x0082, B:21:0x008e, B:23:0x00db, B:26:0x0122, B:27:0x0128, B:29:0x013a, B:32:0x0155, B:34:0x0165, B:35:0x018b, B:37:0x01a5, B:38:0x01ad, B:41:0x01b6, B:44:0x01c4, B:46:0x01da, B:48:0x01f5, B:49:0x0208, B:51:0x0204, B:53:0x016c, B:56:0x0170, B:58:0x0178, B:59:0x014b, B:60:0x0151), top: B:2:0x0008, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c4 A[Catch: ljy -> 0x0221, TRY_ENTER, TryCatch #1 {ljy -> 0x0221, blocks: (B:3:0x0008, B:6:0x0018, B:8:0x003a, B:9:0x003c, B:11:0x0056, B:12:0x0058, B:15:0x006d, B:18:0x0065, B:19:0x0082, B:21:0x008e, B:23:0x00db, B:26:0x0122, B:27:0x0128, B:29:0x013a, B:32:0x0155, B:34:0x0165, B:35:0x018b, B:37:0x01a5, B:38:0x01ad, B:41:0x01b6, B:44:0x01c4, B:46:0x01da, B:48:0x01f5, B:49:0x0208, B:51:0x0204, B:53:0x016c, B:56:0x0170, B:58:0x0178, B:59:0x014b, B:60:0x0151), top: B:2:0x0008, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01da A[Catch: ljy -> 0x0221, TryCatch #1 {ljy -> 0x0221, blocks: (B:3:0x0008, B:6:0x0018, B:8:0x003a, B:9:0x003c, B:11:0x0056, B:12:0x0058, B:15:0x006d, B:18:0x0065, B:19:0x0082, B:21:0x008e, B:23:0x00db, B:26:0x0122, B:27:0x0128, B:29:0x013a, B:32:0x0155, B:34:0x0165, B:35:0x018b, B:37:0x01a5, B:38:0x01ad, B:41:0x01b6, B:44:0x01c4, B:46:0x01da, B:48:0x01f5, B:49:0x0208, B:51:0x0204, B:53:0x016c, B:56:0x0170, B:58:0x0178, B:59:0x014b, B:60:0x0151), top: B:2:0x0008, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016c A[Catch: ljy -> 0x0221, TRY_LEAVE, TryCatch #1 {ljy -> 0x0221, blocks: (B:3:0x0008, B:6:0x0018, B:8:0x003a, B:9:0x003c, B:11:0x0056, B:12:0x0058, B:15:0x006d, B:18:0x0065, B:19:0x0082, B:21:0x008e, B:23:0x00db, B:26:0x0122, B:27:0x0128, B:29:0x013a, B:32:0x0155, B:34:0x0165, B:35:0x018b, B:37:0x01a5, B:38:0x01ad, B:41:0x01b6, B:44:0x01c4, B:46:0x01da, B:48:0x01f5, B:49:0x0208, B:51:0x0204, B:53:0x016c, B:56:0x0170, B:58:0x0178, B:59:0x014b, B:60:0x0151), top: B:2:0x0008, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, gph] */
    /* JADX WARN: Type inference failed for: r4v17, types: [gwb, java.lang.Object] */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.ksl r22) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.adm.firebase.FmdFirebaseMessagingService.a(ksl):void");
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void b(String str) {
        if (!this.b.d().equals(str)) {
            ewc ewcVar = this.b;
            hwx.K(!TextUtils.isEmpty(str), "gcmRegistrationId cannot be empty");
            ewcVar.m = 2;
            ewcVar.d = str;
        }
    }
}
