package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.widget.R;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.FRDProductSpecificDataEntry;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.ND4CSettings;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import com.google.android.gms.googlehelp.trails.TrailsInteraction;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fow implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int aj = fma.aj(parcel);
        String str = null;
        Account account = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        Bitmap bitmap = null;
        ArrayList arrayList = null;
        Bundle bundle2 = null;
        Bitmap bitmap2 = null;
        byte[] bArr = null;
        String str4 = null;
        Uri uri = null;
        ArrayList arrayList2 = null;
        ThemeSettings themeSettings = null;
        ArrayList arrayList3 = null;
        ErrorReport errorReport = null;
        TogglingData togglingData = null;
        PendingIntent pendingIntent = null;
        String str5 = null;
        String str6 = null;
        ND4CSettings nD4CSettings = null;
        ArrayList arrayList4 = null;
        String str7 = null;
        ArrayList arrayList5 = null;
        String str8 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z4 = false;
        boolean z5 = false;
        int i7 = 0;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        int i8 = 0;
        int i9 = 0;
        while (parcel.dataPosition() < aj) {
            int readInt = parcel.readInt();
            switch (fma.af(readInt)) {
                case 1:
                    i = fma.ah(parcel, readInt);
                    break;
                case 2:
                    str = fma.as(parcel, readInt);
                    break;
                case 3:
                    account = (Account) fma.an(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    bundle = fma.al(parcel, readInt);
                    break;
                case 5:
                    z = fma.ay(parcel, readInt);
                    break;
                case 6:
                    z2 = fma.ay(parcel, readInt);
                    break;
                case 7:
                    arrayList = fma.au(parcel, readInt);
                    break;
                case 8:
                case 9:
                case 12:
                case 13:
                case R.styleable.TextInputLayout_cursorColor /* 24 */:
                case R.styleable.TextInputLayout_endIconCheckable /* 26 */:
                case R.styleable.TextInputLayout_endIconContentDescription /* 27 */:
                case R.styleable.TextInputLayout_endIconMinSize /* 29 */:
                case R.styleable.TextInputLayout_endIconMode /* 30 */:
                default:
                    fma.ax(parcel, readInt);
                    break;
                case 10:
                    bundle2 = fma.al(parcel, readInt);
                    break;
                case 11:
                    bitmap2 = (Bitmap) fma.an(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 14:
                    str4 = fma.as(parcel, readInt);
                    break;
                case 15:
                    uri = (Uri) fma.an(parcel, readInt, Uri.CREATOR);
                    break;
                case 16:
                    arrayList2 = fma.av(parcel, readInt, OverflowMenuItem.CREATOR);
                    break;
                case 17:
                    i4 = fma.ah(parcel, readInt);
                    break;
                case 18:
                    arrayList3 = fma.av(parcel, readInt, OfflineSuggestion.CREATOR);
                    break;
                case 19:
                    bArr = fma.az(parcel, readInt);
                    break;
                case 20:
                    i2 = fma.ah(parcel, readInt);
                    break;
                case 21:
                    i3 = fma.ah(parcel, readInt);
                    break;
                case 22:
                    z3 = fma.ay(parcel, readInt);
                    break;
                case 23:
                    errorReport = (ErrorReport) fma.an(parcel, readInt, ErrorReport.CREATOR);
                    break;
                case R.styleable.TextInputLayout_cursorErrorColor /* 25 */:
                    themeSettings = (ThemeSettings) fma.an(parcel, readInt, ThemeSettings.CREATOR);
                    break;
                case R.styleable.TextInputLayout_endIconDrawable /* 28 */:
                    str2 = fma.as(parcel, readInt);
                    break;
                case R.styleable.TextInputLayout_endIconScaleType /* 31 */:
                    togglingData = (TogglingData) fma.an(parcel, readInt, TogglingData.CREATOR);
                    break;
                case R.styleable.TextInputLayout_endIconTint /* 32 */:
                    i5 = fma.ah(parcel, readInt);
                    break;
                case R.styleable.TextInputLayout_endIconTintMode /* 33 */:
                    pendingIntent = (PendingIntent) fma.an(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case R.styleable.TextInputLayout_errorAccessibilityLiveRegion /* 34 */:
                    str3 = fma.as(parcel, readInt);
                    break;
                case 35:
                    bitmap = (Bitmap) fma.an(parcel, readInt, Bitmap.CREATOR);
                    break;
                case R.styleable.TextInputLayout_errorEnabled /* 36 */:
                    i6 = fma.ah(parcel, readInt);
                    break;
                case R.styleable.TextInputLayout_errorIconDrawable /* 37 */:
                    z4 = fma.ay(parcel, readInt);
                    break;
                case R.styleable.TextInputLayout_errorIconTint /* 38 */:
                    z5 = fma.ay(parcel, readInt);
                    break;
                case R.styleable.TextInputLayout_errorIconTintMode /* 39 */:
                    i7 = fma.ah(parcel, readInt);
                    break;
                case R.styleable.TextInputLayout_errorTextAppearance /* 40 */:
                    str5 = fma.as(parcel, readInt);
                    break;
                case R.styleable.TextInputLayout_errorTextColor /* 41 */:
                    z6 = fma.ay(parcel, readInt);
                    break;
                case R.styleable.TextInputLayout_expandedHintEnabled /* 42 */:
                    str6 = fma.as(parcel, readInt);
                    break;
                case R.styleable.TextInputLayout_helperText /* 43 */:
                    z7 = fma.ay(parcel, readInt);
                    break;
                case R.styleable.TextInputLayout_helperTextEnabled /* 44 */:
                    nD4CSettings = (ND4CSettings) fma.an(parcel, readInt, ND4CSettings.CREATOR);
                    break;
                case R.styleable.TextInputLayout_helperTextTextAppearance /* 45 */:
                    z8 = fma.ay(parcel, readInt);
                    break;
                case R.styleable.TextInputLayout_helperTextTextColor /* 46 */:
                    arrayList4 = fma.av(parcel, readInt, FRDProductSpecificDataEntry.CREATOR);
                    break;
                case R.styleable.TextInputLayout_hintAnimationEnabled /* 47 */:
                    str7 = fma.as(parcel, readInt);
                    break;
                case R.styleable.TextInputLayout_hintEnabled /* 48 */:
                    i8 = fma.ah(parcel, readInt);
                    break;
                case R.styleable.TextInputLayout_hintTextAppearance /* 49 */:
                    i9 = fma.ah(parcel, readInt);
                    break;
                case R.styleable.TextInputLayout_hintTextColor /* 50 */:
                    arrayList5 = fma.av(parcel, readInt, TrailsInteraction.CREATOR);
                    break;
                case R.styleable.TextInputLayout_passwordToggleContentDescription /* 51 */:
                    str8 = fma.as(parcel, readInt);
                    break;
            }
        }
        fma.aw(parcel, aj);
        return new GoogleHelp(i, str, account, bundle, str2, str3, bitmap, z, z2, arrayList, bundle2, bitmap2, bArr, i2, i3, str4, uri, arrayList2, i4, themeSettings, arrayList3, z3, errorReport, togglingData, i5, pendingIntent, i6, z4, z5, i7, str5, z6, str6, z7, nD4CSettings, z8, arrayList4, str7, i8, i9, arrayList5, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleHelp[i];
    }
}
