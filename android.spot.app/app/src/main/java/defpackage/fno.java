package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.AdditionalConsentConfig;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fno implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int aj = fma.aj(parcel);
        String str = null;
        Bundle bundle = null;
        String str2 = null;
        ApplicationErrorReport applicationErrorReport = null;
        String str3 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str4 = null;
        ArrayList arrayList = null;
        ThemeSettings themeSettings = null;
        LogOptions logOptions = null;
        Bitmap bitmap = null;
        String str5 = null;
        String str6 = null;
        AdditionalConsentConfig additionalConsentConfig = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < aj) {
            int readInt = parcel.readInt();
            switch (fma.af(readInt)) {
                case 2:
                    str = fma.as(parcel, readInt);
                    break;
                case 3:
                    bundle = fma.al(parcel, readInt);
                    break;
                case 4:
                default:
                    fma.ax(parcel, readInt);
                    break;
                case 5:
                    str2 = fma.as(parcel, readInt);
                    break;
                case 6:
                    applicationErrorReport = (ApplicationErrorReport) fma.an(parcel, readInt, ApplicationErrorReport.CREATOR);
                    break;
                case 7:
                    str3 = fma.as(parcel, readInt);
                    break;
                case 8:
                    bitmapTeleporter = (BitmapTeleporter) fma.an(parcel, readInt, BitmapTeleporter.CREATOR);
                    break;
                case 9:
                    str4 = fma.as(parcel, readInt);
                    break;
                case 10:
                    arrayList = fma.av(parcel, readInt, FileTeleporter.CREATOR);
                    break;
                case 11:
                    z = fma.ay(parcel, readInt);
                    break;
                case 12:
                    themeSettings = (ThemeSettings) fma.an(parcel, readInt, ThemeSettings.CREATOR);
                    break;
                case 13:
                    logOptions = (LogOptions) fma.an(parcel, readInt, LogOptions.CREATOR);
                    break;
                case 14:
                    z2 = fma.ay(parcel, readInt);
                    break;
                case 15:
                    bitmap = (Bitmap) fma.an(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 16:
                    str5 = fma.as(parcel, readInt);
                    break;
                case 17:
                    z3 = fma.ay(parcel, readInt);
                    break;
                case 18:
                    j = fma.ak(parcel, readInt);
                    break;
                case 19:
                    z4 = fma.ay(parcel, readInt);
                    break;
                case 20:
                    str6 = fma.as(parcel, readInt);
                    break;
                case 21:
                    additionalConsentConfig = (AdditionalConsentConfig) fma.an(parcel, readInt, AdditionalConsentConfig.CREATOR);
                    break;
            }
        }
        fma.aw(parcel, aj);
        return new FeedbackOptions(str, bundle, str2, applicationErrorReport, str3, bitmapTeleporter, str4, arrayList, z, themeSettings, logOptions, z2, bitmap, str5, z3, j, z4, str6, additionalConsentConfig);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FeedbackOptions[i];
    }
}
