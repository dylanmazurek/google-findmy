package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.ar.core.ImageMetadata;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dyg extends pn {
    @Override // defpackage.pn
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        Intent intent = new Intent("android.settings.ADD_ACCOUNT_SETTINGS");
        intent.putExtra("account_types", new String[]{"com.google"});
        intent.setFlags(ImageMetadata.LENS_APERTURE);
        return intent;
    }

    @Override // defpackage.pn
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        return null;
    }
}
