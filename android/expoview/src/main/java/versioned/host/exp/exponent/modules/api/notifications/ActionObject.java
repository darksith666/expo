package versioned.host.exp.exponent.modules.api.notifications;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.HashMap;

@Entity(tableName = "actions")
public class ActionObject {
  @PrimaryKey
  @NonNull
  @ColumnInfo(name = "action_id")
  private String actionId;

  @ColumnInfo(name = "button_title")
  private String buttonTitle;

  @ColumnInfo(name = "is_destructive")
  private Boolean isDestructive = false;

  @ColumnInfo(name = "is_authentication_required")
  private Boolean isAuthenticationRequired = false;

  @ColumnInfo(name = "submit_button_tittle")
  private String submitButtonTittle = "go";

  @ColumnInfo(name = "placeholder")
  private String placeholder = "...";

  @ColumnInfo(name = "contain_text_input")
  private Boolean containTextInput = false;
  
  public Boolean getContainTextInput() {
    return containTextInput;
  }

  public void setContainTextInput(Boolean containTextInput) {
    this.containTextInput = containTextInput;
  }

  public String getSubmitButtonTittle() {
    return submitButtonTittle;
  }

  public void setSubmitButtonTittle(String submitButtonTittle) {
    this.submitButtonTittle = submitButtonTittle;
  }

  public String getPlaceholder() {
    return placeholder;
  }

  public void setPlaceholder(String placeholder) {
    this.placeholder = placeholder;
  }

  @NonNull
  public String getActionId() {
    return actionId;
  }

  public void setActionId(@NonNull String actionId) {
    this.actionId = actionId;
  }

  public String getButtonTitle() {
    return buttonTitle;
  }

  public void setButtonTitle(String buttonTitle) {
    this.buttonTitle = buttonTitle;
  }

  public Boolean isDestructive() {
    return isDestructive;
  }

  public void setDestructive(Boolean destructive) {
    isDestructive = destructive;
  }

  public Boolean isAuthenticationRequired() {
    return isAuthenticationRequired;
  }

  public void setAuthenticationRequired(Boolean authenticationRequired) {
    isAuthenticationRequired = authenticationRequired;
  }

  public void populateObjectWithDataFromMap(HashMap<String, Object> map) {
    this.actionId = (String)map.get("actionId");
    this.buttonTitle = (String)map.get("buttonTittle");
    this.isDestructive = (Boolean)map.get("isDestructive");
    this.isAuthenticationRequired = (Boolean)map.get("isAuthenticationRequired");
    this.containTextInput = (map.get("textInput") != null);
    if (this.containTextInput) {
      this.placeholder = (String)map.get("placeholder");
      this.submitButtonTittle = (String)map.get("submitButtonTittle");
    }
  }
}
