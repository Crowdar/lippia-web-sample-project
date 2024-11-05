package lippia.web.constants;

public class TimeEntryPageConstants {
    public static final String DROPDOWN_PROJECTS ="xpath://button[contains(text(), '%s')]";
    public static final String BUTTON_PROJECTS ="xpath://img[@alt='assets/ui-icons/plus-blue.svg']";
    public static final String BUTTON_PROJECTS_NEW ="xpath://a[contains(@class, 'cl-project-name') and .//span[text()='Automation web']]";
    public static final String START_DATE_INPUT ="xpath:(//input[contains(@class, 'time-picker')])[1]";
    public static final String END_DATE_INPUT ="xpath:(//input[contains(@class, 'time-picker')])[2]";
    public static final String DESCRIPTION_INPUT ="xpath://input[@type='text' and @name='autocomplete-input']";
    public static final String DATE_INPUT ="xpath://input[contains(@class, 'input-date-picker')]";
    public static final String ADD_BUTTON ="xpath://div[@data-cy='add-btn']";
    public static final String TIME_ENTRY_CREATED = "xpath://div[contains(@class, 'toast-title')]";
    public static final String LAYOUT = "xpath://p[contains(@class, 'cl-cut-text') and contains(@class, 'cl-my-0')]";
    public static final String MANUAL_MODE_BUTTON = "xpath://a[@data-cy='manual-mode']";
    public static final String TIMER_MODE_BUTTON ="xpath://img[@alt='Track time using timer selected']";
    public static final String START_BUTTON = "xpath://button[contains(@class, 'cl-btn-primary')]";
    public static final String TIMER_OPTIONS_BUTTON = "xpath://div[contains(@class, 'cl-dropdown-toggle') and contains(@class, 'pointer') and @placement='bottom']";
    public static final String DISCARD_BUTTON = "xpath://a[contains(@class, 'cl-dropdown-item') and contains(@class, 'cl-text-red') and text()=' Discard']";
    public static final String DISCARD_CONFIRMATION_BUTTON = "xpath://button[contains(@class, 'cl-btn') and contains(@class, 'cl-btn-primary') and text()=' Discard ']";
    public static final String NEW_DESCRIPTION_INPUT = "xpath:(//input[contains(@class, 'cl-input-description') and @placeholder='Add description'])[1]";
    public static final String START_TIME_INPUT_NEW = "xpath:(//input[contains(@class, 'time-picker')])[4]";
    public static final String END_TIME_INPUT_NEW = "xpath:(//input[contains(@class, 'time-picker')])[5]";
    public static final String BILLABLE_BUTTON = "xpath://span[@class='currency billableOn' and @aria-label='Billable']";
    public static final String ADD_TAGS = "xpath://div[contains(@class, 'cl-component-divided-left')]//img[@class='tag-icon']";
    public static final String MENU_OPTION="xpath://div[contains(@class, 'cl-dropdown-toggle') and contains(@class, 'pointer') and contains(@class, 'cl-non-selectable')]";
    public static final String DELETE_BUTTON_OPTION = "xpath://a[@data-cy='delete-button' and contains(@class, 'cl-dropdown-item') and contains(@class, 'cl-text-danger')]";
    public static final String DELETE_BUTTON_CONFIRM = "xpath://button[contains(@class, 'cl-btn') and contains(@class, 'cl-btn-danger') and text()=' Delete ']";
    public static final String CHECKBOXS_TAGS ="xpath://label[@class='cl-custom-control-label']/div[text()='%s']";
}
