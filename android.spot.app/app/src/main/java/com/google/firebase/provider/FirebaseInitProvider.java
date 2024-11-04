package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.adm.R;
import defpackage.fma;
import defpackage.knh;
import defpackage.knl;
import defpackage.knm;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FirebaseInitProvider extends ContentProvider {
    public static final knm a = new knm(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    public static final AtomicBoolean b = new AtomicBoolean(false);

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        fma.aS(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if (!"com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            super.attachInfo(context, providerInfo);
            return;
        }
        throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        knl knlVar;
        try {
            AtomicBoolean atomicBoolean = b;
            atomicBoolean.set(true);
            Context context = getContext();
            synchronized (knh.a) {
                if (knh.b.containsKey("[DEFAULT]")) {
                    knh.b();
                } else {
                    fma.aR(context);
                    Resources resources = context.getResources();
                    String resourcePackageName = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                    String aE = fma.aE("google_app_id", resources, resourcePackageName);
                    if (TextUtils.isEmpty(aE)) {
                        knlVar = null;
                    } else {
                        knlVar = new knl(aE, fma.aE("google_api_key", resources, resourcePackageName), fma.aE("firebase_database_url", resources, resourcePackageName), fma.aE("ga_trackingId", resources, resourcePackageName), fma.aE("gcm_defaultSenderId", resources, resourcePackageName), fma.aE("google_storage_bucket", resources, resourcePackageName), fma.aE("project_id", resources, resourcePackageName));
                    }
                    if (knlVar == null) {
                        Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    } else {
                        knh.c(context, knlVar, "[DEFAULT]");
                    }
                }
            }
            atomicBoolean.set(false);
            return false;
        } catch (Throwable th) {
            b.set(false);
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
